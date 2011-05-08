package com.brechtel.toaster
import android.view.View

object AndroidImplicits {
  implicit def function2Listener (action: () => Any) = {
    new View.OnClickListener() {
      def onClick(v: View) {action ()}
    }
  }
}
