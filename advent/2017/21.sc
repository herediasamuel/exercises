// vim: ft=scala

val input = Vector(
  "../.." → ".../.##/.##",
  "#./.." → ".#./.#./##.",
  "##/.." → "##./.../..#",
  ".#/#." → "#../..#/##.",
  "##/#." → ".../.#./..#",
  "##/##" → "#.#/.##/.##",
  ".../.../..." → "##../.#../##../#..#",
  "#../.../..." → "..#./##.#/#.##/....",
  ".#./.../..." → "####/#.##/..../...#",
  "##./.../..." → "####/...#/.###/..##",
  "#.#/.../..." → "..#./..#./##../##.#",
  "###/.../..." → "..#./..#./##../...#",
  ".#./#../..." → "##.#/###./###./#..#",
  "##./#../..." → ".#../..##/#.#./#.#.",
  "..#/#../..." → ".##./..../...#/.###",
  "#.#/#../..." → "##../#..#/#..#/....",
  ".##/#../..." → "..../#.../..##/##..",
  "###/#../..." → "####/#.../.##./#...",
  ".../.#./..." → "####/#.../.###/###.",
  "#../.#./..." → "#.#./.###/#.../##.#",
  ".#./.#./..." → ".##./##.#/..##/.#..",
  "##./.#./..." → "..##/.#../..##/##.#",
  "#.#/.#./..." → ".##./.#.#/.#.#/....",
  "###/.#./..." → "..../##.#/#.#./.###",
  ".#./##./..." → "..#./#.../#.../..##",
  "##./##./..." → "##.#/##.#/#.##/#...",
  "..#/##./..." → ".#../.#.#/#.##/####",
  "#.#/##./..." → "..#./#.##/..../.##.",
  ".##/##./..." → "#.##/..##/...#/....",
  "###/##./..." → "..#./#.../#.##/.#.#",
  ".../#.#/..." → "..##/#.#./##../#...",
  "#../#.#/..." → "#.#./..#./.#../..##",
  ".#./#.#/..." → "#.#./.#.#/.#../..##",
  "##./#.#/..." → "###./##.#/#..#/####",
  "#.#/#.#/..." → "##.#/..##/#.../...#",
  "###/#.#/..." → "##.#/..##/###./##..",
  ".../###/..." → "..../...#/##../.###",
  "#../###/..." → ".##./##.#/..../#...",
  ".#./###/..." → "###./..##/.##./#...",
  "##./###/..." → ".##./#..#/.###/.#..",
  "#.#/###/..." → "..../#.#./#.../#..#",
  "###/###/..." → ".#../#.#./#.##/##.#",
  "..#/.../#.." → "##../...#/.#../###.",
  "#.#/.../#.." → "#..#/.#../#.#./..#.",
  ".##/.../#.." → "#.##/.#../...#/.#.#",
  "###/.../#.." → ".#.#/#.../.#.#/.#..",
  ".##/#../#.." → "..#./..../###./#...",
  "###/#../#.." → ".##./##../.#.#/##.#",
  "..#/.#./#.." → "###./.##./###./.###",
  "#.#/.#./#.." → "..../..../#.##/.#..",
  ".##/.#./#.." → ".#.#/.#.#/#.../####",
  "###/.#./#.." → "#.../####/#.##/#.#.",
  ".##/##./#.." → "#.../#.##/#.../###.",
  "###/##./#.." → "...#/.##./#.../.##.",
  "#../..#/#.." → "##../##../..##/....",
  ".#./..#/#.." → "#.#./##../.###/#.##",
  "##./..#/#.." → "#.#./####/.###/...#",
  "#.#/..#/#.." → "#..#/##.#/.#../..#.",
  ".##/..#/#.." → ".###/.#../#.##/.##.",
  "###/..#/#.." → ".###/#.##/..#./..##",
  "#../#.#/#.." → "####/#.../####/##.#",
  ".#./#.#/#.." → ".###/####/####/.#..",
  "##./#.#/#.." → "##.#/...#/..../##.#",
  "..#/#.#/#.." → ".#../..#./.##./.#..",
  "#.#/#.#/#.." → "...#/###./..##/.###",
  ".##/#.#/#.." → "####/##../#..#/##..",
  "###/#.#/#.." → ".#.#/..##/.###/##..",
  "#../.##/#.." → "#..#/#.##/#..#/.###",
  ".#./.##/#.." → "##../.###/..../###.",
  "##./.##/#.." → ".###/.###/##../.##.",
  "#.#/.##/#.." → "..#./.##./##../#.#.",
  ".##/.##/#.." → "####/#..#/..#./....",
  "###/.##/#.." → "#.../.#../#..#/.#..",
  "#../###/#.." → "..../.#../.##./.#.#",
  ".#./###/#.." → "..../####/#.##/###.",
  "##./###/#.." → "...#/.#../#.../##.#",
  "..#/###/#.." → "####/###./###./....",
  "#.#/###/#.." → ".#../.###/##.#/.###",
  ".##/###/#.." → "#.##/##../##../.#..",
  "###/###/#.." → ".###/###./#..#/.#.#",
  ".#./#.#/.#." → "###./.###/.###/.##.",
  "##./#.#/.#." → ".#.#/##../###./..#.",
  "#.#/#.#/.#." → ".#.#/##../###./#.##",
  "###/#.#/.#." → "..#./.#../.#../..#.",
  ".#./###/.#." → "#..#/..##/#.#./#.#.",
  "##./###/.#." → ".#../#..#/#.#./.##.",
  "#.#/###/.#." → ".#.#/.##./.###/....",
  "###/###/.#." → "#.#./#.#./##../.#..",
  "#.#/..#/##." → ".#.#/.#.#/#..#/.#.#",
  "###/..#/##." → "#.#./##.#/.#../#.##",
  ".##/#.#/##." → "#.##/#.##/#.##/##.#",
  "###/#.#/##." → "###./##../.#.#/#...",
  "#.#/.##/##." → "##.#/.#.#/.#.#/.#.#",
  "###/.##/##." → ".#.#/#.##/####/....",
  ".##/###/##." → "#.../####/###./.###",
  "###/###/##." → ".##./#.#./#.##/##..",
  "#.#/.../#.#" → "#.../##.#/#.##/##.#",
  "###/.../#.#" → "#.#./#.##/##.#/.##.",
  "###/#../#.#" → "##../.#.#/##.#/#...",
  "#.#/.#./#.#" → ".##./.#../#.../.#.#",
  "###/.#./#.#" → "#.#./..##/###./..##",
  "###/##./#.#" → ".###/..##/..#./..#.",
  "#.#/#.#/#.#" → ".#../##.#/.#.#/.#.#",
  "###/#.#/#.#" → "##.#/.#.#/...#/...#",
  "#.#/###/#.#" → "##.#/.#../####/#..#",
  "###/###/#.#" → "...#/..##/##../#..#",
  "###/#.#/###" → "..##/.##./.##./#.##",
  "###/###/###" → "#.#./.#.#/#.../.##."
)

// A pattern is represented as a linear array of flattened rows.
def parsePattern(line: String): Array[Int] =
  line.replaceAll("[^#.]", "").toArray.map { case '.' ⇒ 0 case '#' ⇒ 1 }

val inputRules: Seq[(Array[Int], Array[Int])] =
  input.map { case (from, to) ⇒ parsePattern(from) → parsePattern(to) }

def rotate90(data: Array[Int]): Array[Int] = data.length match {
  case 4 ⇒
    val z = new Array[Int](4)
    z(0) = data(1); z(1) = data(3)
    z(2) = data(0); z(3) = data(2)
    z
  case 9 ⇒
    val z = new Array[Int](9)
    z(0) = data(2); z(1) = data(5); z(2) = data(8)
    z(3) = data(1); z(4) = data(4); z(5) = data(7)
    z(6) = data(0); z(7) = data(3); z(8) = data(6)
    z
}

def flipV(data: Array[Int]): Array[Int] = data.length match {
  case 4 ⇒
    val z = new Array[Int](4)
    z(0) = data(2); z(1) = data(3)
    z(2) = data(0); z(3) = data(1)
    z
  case 9 ⇒
    val z = new Array[Int](9)
    z(0) = data(6); z(1) = data(7); z(2) = data(8)
    z(3) = data(3); z(4) = data(4); z(5) = data(5)
    z(6) = data(0); z(7) = data(1); z(8) = data(2)
    z
}

def variants(g: Array[Int]) = {
  val g90  = rotate90(g)
  val g180 = rotate90(g90)
  val g270 = rotate90(g180)
  val rots = Seq(g, g90, g180, g270)
  rots ++ rots.map(flipV)
}

// Arrays cannot be used for equality checking, so we use IndexedSeqs as keys.
val rules: Map[IndexedSeq[Int], Array[Int]] =
  inputRules
    .flatMap { case (from, to) ⇒ variants(from).map(_ → to) }
    .map     { case (from, to) ⇒ from.toIndexedSeq → to }
    .toMap

def process(image: Array[Int]): Array[Int] = {
  val n = math.sqrt(image.length).toInt
  val s = if (n % 2 == 0) 2 else if (n % 3 == 0) 3 else ???
  val N = n / s
  val ss = s + 1
  val nn = ss * N

  val output = new Array[Int](nn * nn)
  val square = new Array[Int](s * s)
  val squareAsSeq = square.deep.asInstanceOf[IndexedSeq[Int]]
  for (i ← 0 until N; j ← 0 until N) {
    extract(fromImg=image, intoSquare=square, n, s)(i, j)
    val enhanced = rules(squareAsSeq)
    insert(fromSquare=enhanced, intoImg=output, nn, ss)(i, j)
  }
  output
}

def indexOfFirst(imgSize: Int, squareSize: Int, i: Int, j: Int) =
  squareSize * (j + i * imgSize)

def extract(fromImg: Array[Int], intoSquare: Array[Int], imgSize: Int, squareSize: Int)(i: Int, j: Int): Unit = {
  val k = indexOfFirst(imgSize, squareSize, i, j)
  for (di ← 0 until squareSize; dj ← 0 until squareSize) {
    intoSquare(dj + di * squareSize) = fromImg(k + dj + di * imgSize)
  }
}

def insert(fromSquare: Array[Int], intoImg: Array[Int], imgSize: Int, squareSize: Int)(i: Int, j: Int): Unit = {
  val k = indexOfFirst(imgSize, squareSize, i, j)
  for (di ← 0 until squareSize; dj ← 0 until squareSize) {
    intoImg(k + dj + di * imgSize) = fromSquare(dj + di * squareSize)
  }
}

val initial = parsePattern(".#./..#/###")
val imgs = Stream.iterate(initial)(process)
println(imgs(5).sum)
println(imgs(18).sum)