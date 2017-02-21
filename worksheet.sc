"abcdabef".toLowerCase.groupBy(character => character).map(pair => (pair._1, pair._2.length)).toList.sortBy(pair => pair._1)

List(('a', 1), ('d', 1), ('l', 1), ('r', 1)).toMap

Map('a' -> 1) - ('a',1)




