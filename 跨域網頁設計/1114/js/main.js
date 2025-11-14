// JavaScript for form handling
document.addEventListener('DOMContentLoaded', function () {
    const form = document.querySelector('form');
    form.addEventListener('submit', function (event) {
        event.preventDefault();
        const name = document.getElementById('name').value;
        const pwd = document.getElementById('pwd').value;
        const addr = document.getElementById('addr').value;
        const phone = document.getElementById('phone').value;
        const email = document.getElementById('email').value;
        const sex = document.querySelector('input[name="sex"]:checked');
        const age = document.querySelector('input[name="age"]:checked');
        const skills = document.querySelectorAll('input[name="skill"]:checked');
        const color1 = document.getElementById('color1').value;
        const color2 = document.getElementById('color2').value;
        const color3 = document.getElementById('color3').value;

        if (!name || !pwd || !addr || !phone || !email || !sex || !age) {
            alert('請填寫所有必要欄位');
            return;
        }

        let skillList = [];
        skills.forEach(skill => skillList.push(skill.value));

        alert('表單提交成功！\n姓名: ' + name + '\n地址: ' + addr + '\n電話: ' + phone + '\nEmail: ' + email + '\n性別: ' + sex.value + '\n年齡層: ' + age.value + '\n電腦能力: ' + skillList.join(', ') + '\n顏色1: ' + color1 + '\n顏色2: ' + color2 + '\n顏色3: ' + color3);
    });
});