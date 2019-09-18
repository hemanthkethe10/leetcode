fun main() {
    println(countSegments("hello"))
//        ", , , ,        a, eaefa"))
}

fun countSegments(s: String): Int {
    val segmentList = s.trim().split("\\s+".toRegex())
    println(segmentList)
   return if (segmentList.size ==1 && segmentList[0]=="")
        return 0
    else
        segmentList.size
}