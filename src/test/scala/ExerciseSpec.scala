import chapter1.Exercise.{check, fuse, permutations}
import org.scalactic.TypeCheckedTripleEquals
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class ExerciseSpec extends AnyWordSpec with Matchers with TypeCheckedTripleEquals {
    "Exercise 1" should {
        "exercise 2" in {
            val leftValue = Option(3)
            val rightValue = Option(5)
            val actual = fuse(leftValue, rightValue)
            val expected = Option((3, 5))

            actual should ===(expected)
        }

        "exercise 3" in {
            val actual = check(0 until 10)(40 / _ > 0)
            actual should ===(false)
        }

        "exercise 5" in {
            val actual = permutations("azef")
            val expected = Seq("b", "a", "f", "g")
            actual should ===(expected)
        }
    }
}
