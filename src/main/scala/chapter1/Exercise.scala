package chapter1

import scala.util.{Right, Try}

object Exercise {
    /* exercise 1 */
//    def compose[A, B, C](g: B => C, f: A => B): A => C = g(f(A))

    /* exercise 2 */
    def fuse[A, B](a: Option[A], b: Option[B]): Option[(A, B)] =
        for {
        l <- a
        r <- b
    } yield (l, r)

    /* exercise 3 */
    def check[T](xs: Seq[T])(pred: T => Boolean): Boolean =
        xs.foldLeft(true)((acc, x) => Try(pred(x)).getOrElse(false) && acc)

    class Pair[P, Q](val first: P, val second: Q)

    /* exercise 5 */
    def permutations(x: String): Seq[String] = x.map {
        case 'z' => 'a'.toString
        case i => (i + 1).toChar.toString
    }

    /** exercise 6
     * 这感觉不像是算法设计，而是网络传输
     * 首先发出纸条应该有签名，即可以知道是谁发出消息，当下一个人接收纸条后，在
     * 纸条上签上自己的名字，然后转发至其他隔间。同理，等纸条上都签上了名，传回
     * 给纸条发出者，就可以确定所有人都得知了碰头时间，如果有任一同事不响应碰头
     * 时间（超出等待时间），则判断这次时间协调无效。
      */

    /** exercise 7
     * 如果是在公告板，也是同理，在碰头时间下签名表示赞同这个时间，不同的是在碰
     * 头时间之前，这个消息都不会作废。这个机制就是akka的机制，等同事有空就去公
     * 告板处理，而不用像消息，需要及时响应处理。
     */

}
