const hamburguer = document.querySelector(".hamburguer");
const navList = document.querySelector(".nav-list");

hamburguer.addEventListener("click", () => {
    hamburguer.classList.toggle("active");
    navList.classList.toggle("active");
})
document.querySelectorAll(".nav-link").forEach(n => n.addEventListener("click", () => {
    hamburguer.classList.remove("active");
    navList.classList.remove("active");

}));