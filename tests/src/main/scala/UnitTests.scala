package com.brechtel.toaster.tests

import junit.framework.Assert._
import _root_.android.test.AndroidTestCase

class UnitTests extends AndroidTestCase {
  def testPackageIsCorrect {
    assertEquals("com.brechtel.toaster", getContext.getPackageName)
  }
}