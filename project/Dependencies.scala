import sbt._ // For understanding Dependencies object as an sbt file

object Dependencies {

  object ver {
    val munit = "0.7.29"
  }

  object lib {

    object test {
      val munit: Seq[ModuleID] = Seq("org.scalameta" %% "munit" % ver.munit).map(_ % Test) // map for the sake of learning
    }
  }
}
