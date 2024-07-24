package fpoly.edu.pd08480_kotlin.mylab


fun main() {
    println("Bài 1 :")
    var a = 0.0
    var b = 0.0
    println("Nhập a:")
    var s = readLine()
    if (s != null) a = s.toDouble()
    println("Nhập b:")
    s = readLine()
    if (s != null) b = s.toDouble()
    if (a == 0.0 && b == 0.0)
    {
        println("Phương trình vô số nghiệm")
    }
    else if (a == 0.0 && b != 0.0) {
        println("Phương trình vô nghiệm")
    } else {
        val x = -b / a
        println("No x=" + x)
    }
    //-----------------------------------------
    println("============")
    println("Bài 2: ")
         var month = 0
    println("Nhập tháng:")
    val s2: String? = readLine()
    if (s2 != null) month = s2.toInt()
    when (month) {
        1, 2, 3 -> println("Tháng " + month + " thuộc quý 1")
        4, 5, 6 -> println("Tháng " + month + " thuộc quý 2")
        7, 8, 9 -> println("Tháng " + month + " thuộc quý 3")
        10, 11, 12 -> println("Tháng " + month + " thuộc quý 4")
        else -> println("Tháng " + month + " không hợp lệ")
    }
    //------------------------------------------
    println("================================")
    println("Bai 3:")
    var year = 0
    var s3: String?
    println("Chương trình kiểm tra năm nhuần:")
    do {
        println("Nhập 1 năm:")
        s3 = readLine()
        while (s3 == null || s3.toInt() < 0) {
            println("Nhập sai năm, nhập lại:")
            s3 = readLine()
        }
        year = s3.toInt()
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println("Năm $year là năm nhuần")
        } else {
            println("Năm $year không phải là năm nhuần")
        }
        print("Tiếp không?(c/k):")
        s3 = readLine()
        if (s3 == "k")
            break;
    } while (true)
    println("Kết thúc chương trình")


}
