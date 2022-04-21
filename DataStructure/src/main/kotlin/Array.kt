import java.util.*

fun main(args: Array<String>) {

    // 기본 배열
    val arr = intArrayOf(1, 2, 3)

    // 크기가 고정되어 있으므로, 추가 시에는 left value 를 통해 새로운 배열을 만들어야 한다.
    val arrPlus = arr.plus(120)

    // 확장 함수로 배열 생성
    val arr2 = IntArray(4) {it}

    val arr3 = IntArray(4) {it * 2}

    // 크기가 고정되어 있는 단점이 존재하므로, 코틀린에서는 ArrayList 와 같은 크기가 자유롭고 추가, 수정, 삭제가 용이한 타입 제공
    val arrayList = arrayListOf(1, 2, 3)

    // 값 추가
    arrayList.add(4)

    // index 값 삭제
    arrayList.removeAt(0)

    // 특정 값 삭제
    arrayList.remove(2)




    // List
    val list = listOf(1, 2, 3)

    val numbers = mutableListOf(1, 2, 3, 4)

    numbers.add(5)

    numbers.removeLast()



    // 코틀린에서도 Stack type를 지원한다.
    val stack = Stack<Int>()

    // 값 추가
    stack.push(3)
    stack.push(1212)

    println(stack.pop())


}