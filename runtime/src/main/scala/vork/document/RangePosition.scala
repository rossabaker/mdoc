package vork.document


object RangePosition {
  def empty: RangePosition = new RangePosition(-1, -1, -1, -1)
}

final class RangePosition(
    val startLine: Int,
    val startColumn: Int,
    val endLine: Int,
    val endColumn: Int
) {
  def isEmpty: Boolean =
    startLine == -1 &&
      startColumn == -1 &&
      endLine == -1 &&
      endColumn == -1
  override def toString: String = {
    val end =
      if (startLine == endLine && startColumn == endColumn) ""
      else s"-$endLine:$endColumn"
    s"$startLine:$startColumn$end"
  }
}
