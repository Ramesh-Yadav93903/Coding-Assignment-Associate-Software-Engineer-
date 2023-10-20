document.getElementById("submitBtn").addEventListener("click", function() {
    var firstName = document.getElementById("firstName").value;
    var lastName = document.getElementById("lastName").value;
    var dateOfBirth = document.getElementById("dateOfBirth").value;
    var country = document.getElementById("country").value;
    var gender = document.querySelector('input[name="gender"]:checked');
    var profession = document.getElementById("profession").value;
    var email = document.getElementById("email").value;
    var mobileNumber = document.getElementById("mobileNumber").value;

    if (!firstName || !lastName || !dateOfBirth || !country || !gender || !profession || !email || !mobileNumber) {
        alert("Please fill out all required fields.");
    } else {
        var genderValue = gender.value;
        var popupData = `First Name: ${firstName}\nLast Name: ${lastName}\nDate of Birth: ${dateOfBirth}\nCountry: ${country}\nGender: ${genderValue}\nProfession: ${profession}\nEmail: ${email}\nMobile Number: ${mobileNumber}`;
        alert(popupData);
        document.getElementById("surveyForm").reset();
    }
});

document.getElementById("resetBtn").addEventListener("click", function() {
    document.getElementById("surveyForm").reset();
});
