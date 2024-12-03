const authButton = document.getElementById('authButton');
const authForm = document.getElementById('authForm');
const tabLinks = document.querySelectorAll('.auth-tabs .tab-link');
const authTabs = document.querySelectorAll('.auth-tab');

authButton.addEventListener('click', () => {
  authForm.style.display = 'block';
});

tabLinks.forEach(link => {
  link.addEventListener('click', function(event) {
    event.preventDefault();
    const target = this.dataset.target;
    tabLinks.forEach(l => l.classList.remove('active'));
    authTabs.forEach(tab => tab.classList.remove('active'));
    this.classList.add('active');
    document.getElementById(target).classList.add('active');
  });
});

const contactLink = document.querySelector('a[href="#contact-info"]');

contactLink.addEventListener('click', function (event) {
  event.preventDefault();
  const contactInfo = document.getElementById('contact-info');
  contactInfo.style.display = 'block';
  //Hide any other elements you want to hide when contact is displayed

  // Optionally, scroll to the contact info section:
  contactInfo.scrollIntoView({ behavior: 'smooth' });
});
