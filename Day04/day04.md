## day04
1.*.kt
    컴파일 -> 실행
    (https://kotlinlang.org/docs/command-line.html)

2. 코틀린
    - 함수 지향형 프로그래밍
        객체 <- 함수
        고차함수(parameter / returnc)
            (람다표현식 / 함수)
            -> / ::
        for => 제어문이 함수화 됨 =>forEach
            collection 함수
            
        다양한 함수 선언 형식

    - 객체
        class
            //오버로딩(주 생성자, 보조 생성자)
            constructor()
            init{}
            this

            static
                object              singleton
                companion object    공용 속성 / 함수

        => data class                  beans
        캡슐화
            var / val               (read/write)
            접근제어자                 (외부)
            getter / setter

        상속
            open /:
            super/ super()
            오버라이딩
                open/ override
            다형 
                - 형변환 : is as
            추상 
                - abastract / interface



부모의 확장
    1. 상속
    2. extention 함수 / 속성
        fun 함수명: 리턴{}
        =>fun 확장클래스 함수명: 리턴{}
    3.[infix 함수]("https://kotlinlang.org/docs/functions.html#infix-notation")

    
[범위(Scope)함수]("https://kotlinlang.org/docs/scope-functions.html#scope-functions.md")

[비정상 함수]("https://kotlinlang.org/docs/exceptions.htm")