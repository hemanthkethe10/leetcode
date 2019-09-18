 fun reachNumber(target: Int): Int {
        var target = target
        target = Math.abs(target)
        var k = 0
        while (target > 0)
            target -= ++k
        return if (target % 2 == 0) k else k + 1 + k % 2
    }