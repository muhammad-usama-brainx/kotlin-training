fun main(args: Array<String>) {
    var p1 =
        Person("Usama Javed", "usamajaved1119@gmail.com", "03059111998", 24);
}


class Person(
    override var name: String,
    override var email: String,
    override var phone: String,
    override var age: Int
) : BasicInfoProvider {
}

interface BasicInfoProvider {
    var name: String;
    var email: String;
    var phone: String;
    var age: Int;
}