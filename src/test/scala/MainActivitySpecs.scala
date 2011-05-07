package com.brechtel.toaster

import org.specs2.mutable._
import org.specs2.mock.Mockito
import org.specs2.matcher.{Expectable, Matcher}
import org.specs2.specification.BeforeExample
import com.github.jbrechtel.robospecs.RoboSpecs

class MainActivitySpecs extends RoboSpecs with Mockito {

  "onCreate" should {
    "set the content view" in {
      val activity = new MainActivity()
      activity.onCreate(null)
      activity.findViewById(R.id.message) must not beNull
    }
  }
}
