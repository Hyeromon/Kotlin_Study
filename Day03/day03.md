### 제어문 : 최신의 경향

    조건에 의한 분기

        - if

        - when

    조건에 의한 반복

        - for                   :범위형 반복문

            범위형 연산 : .. / until / in

            진행형 연산 : downTo / step(증가치)

        - while / do ~ while    :조건형 반복문

        제어

            - break / continue : 라벨

### 함수

    기본함수
        fun 함수명(){}

        *Unit -> return이 없음 : void

            fun 함수명():Unit{}

        표현식(삼항 연산자 대치)

            fun 함수명() = 함수 내용

    지역함수(내부함수) = 내부클래스

        fun함수(){
            fun 내부함수(){
            }
            1. 이름있는 함수
            2. 익명 함수
        }
        - 오버로딩
        -디폴트 argument
        -이름있는 argument

    일급함수(고차함수)
        1.익명함수 = 변수 할당

        var result = fun(x:Int, y:Int):Int{
            return x+y
        }
        
        2.람다함수(표현)
        val result: () -> Unit = {println("파라미터가 없음")}

        람다함수 : 컬렉션
        ->Stream
            컬렉션
                1.List / Set / Map
                2.Mutable / Immutable

            컬렉션 함수
                필터
                조건/검색
                맵
                추출
                정렬
                변환

클래스

캡슐화

접근제어자
    public
    internal(default)
    protected
    private


