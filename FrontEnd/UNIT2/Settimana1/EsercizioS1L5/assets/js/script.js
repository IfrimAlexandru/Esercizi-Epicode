const nav = document.getElementById("navId");
const btnNav = document.getElementById("btnScroll");

window.addEventListener("scroll", function(){
    if (window.scrollY > 480){
        nav.classList.add("cambioBg")
        btnNav.classList.add("cambioBgBtn")
    }else{
        nav.classList.remove("cambioBg")
        btnNav.classList.remove("cambioBgBtn")
    }
})