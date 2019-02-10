trait List[E] {
  def prepend(): Unit
  def append(): Unit
  def insert(e:E, idx:Long): Unit
  def clear(): Unit
  def get(idx:Long): E
  def remove(idx:Long): Unit
  def removeFirst(e:E): Unit
  def removeAll(e:E): Unit
  def size(): Long
  def isEmpty(): Boolean
}
