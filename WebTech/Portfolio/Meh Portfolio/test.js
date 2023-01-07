const header = document.querySelector('.navbar');

window.onscroll = function() {
    var top = window.scrollY;
    if (top >= 100) {
        header.classList.add('navbar');
    } else {
        header.classList.remove('navbar');
    }
}

// collapse navbar after click on small devices
const navLinks = document.querySelectorAll('.nav-item')
const menuToggle = document.getElementById('navbarNav')

navLinks.forEach((l) => {
    l.addEventListener('click', () => { new bootstrap.Collapse(menuToggle).toggle() })
})