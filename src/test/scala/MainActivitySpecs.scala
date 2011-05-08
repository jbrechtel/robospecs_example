package com.brechtel.toaster

import org.specs2.mutable._
import org.specs2.mock.Mockito
import org.specs2.matcher.{Expectable, Matcher}
import org.specs2.specification.BeforeExample
import com.github.jbrechtel.robospecs.RoboSpecs
import com.xtremelabs.robolectric.shadows._

class MainActivitySpecs extends RoboSpecs with Mockito {

  "onCreate" should {
    "set the content view" in {
      val activity = new MainActivity()
      activity.onCreate(null)
      activity.findViewById(R.id.message) must not beNull
    }
  }

  "showMessageButton" should {
    "be the Show Message button in the view" in {
      val activity = new MainActivity()
      activity.onCreate(null)
      activity.showMessageButton == activity.findViewById(R.id.show_message)
    }
  }

  "messageEditText" should {
    "be the EditText in the view" in {
      val activity = new MainActivity()
      activity.onCreate(null)
      activity.messageEditText == activity.findViewById(R.id.message)
    }
  }

  "clicking the showMessageButton" should {
    "show a toast popup with text from the message input field" in {
      val activity = new MainActivity()
      activity.onCreate(null)
      activity.messageEditText.setText("expected message")
      activity.showMessageButton.performClick()
      ShadowToast.getTextOfLatestToast must beEqualTo("expected message")
    }
  }
}
