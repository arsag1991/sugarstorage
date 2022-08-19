abstract class Registration {
    open fun text (login: String, password: String){
        println("Логин- $login, пароль- $password")
    }
}
class RegistrationViaNumber: Registration() {
    override fun text(login: String, password: String) {
        if (login.length == 10)
            super.text(login, password)
    }
}
class RegistrationViaLogin: Registration(){
    override fun text(login: String, password: String) {
        if (login.contains("@"))
        super.text(login, password)
    }
}

fun main(args: Array<String>) {
    var registrationViaNumber = RegistrationViaNumber()
    var registrationViaLogin = RegistrationViaLogin()

    registrationViaNumber.text("9288555550", "1234qwe")
    registrationViaLogin.text("arsag1991@mail.ru", "32df1g65dfg6")
}