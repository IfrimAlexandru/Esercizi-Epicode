package it.nextdevs.EsercizioS3G2.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import it.nextdevs.EsercizioS3G2.exception.UnauthorizedException;
import it.nextdevs.EsercizioS3G2.model.Dipendente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtTool {
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.duration}")
    private long duration;
    // crea il token impostando data di inizio, data di fine, id dell'utente e firma del token attraverso la chiave segreta
    public String createToken(Dipendente dipendente){
        return Jwts.builder().issuedAt(new Date(System.currentTimeMillis())).
                expiration(new Date(System.currentTimeMillis() + duration)).
                subject(String.valueOf(dipendente.getId())).
                signWith(Keys.hmacShaKeyFor(secret.getBytes())).
                compact();
    }
    //effettua la verifica del token ricevuto. Verifica la veridicità del token e la sua scadenza
    public void verifyToken(String token){
        try {
            Jwts.parser().verifyWith(Keys.hmacShaKeyFor(secret.getBytes())).
                    build().parse(token);
        }
        catch (Exception e){
            throw  new UnauthorizedException("Error in authorization, relogin!");
        }
    }

    public int getUsernameFromDipendente(String token){
        return Integer.parseInt(Jwts.parser().verifyWith(Keys.hmacShaKeyFor(secret.getBytes())).build().parseSignedClaims(token).
                getPayload().getSubject());
    }

}
