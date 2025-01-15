fun main(){
    var noNullableString:String = "Hello" //null값이 들어올 수 없음
    var nullableString: String? ="Hello" //? : null값 허용
    //var nullableString2: String? = null //초기화는 시켜줘야함!!
    //noNullableString = null //성립하지 않음.
    nullableString = null   //성립

    println(noNullableString)
    println(nullableString)
}