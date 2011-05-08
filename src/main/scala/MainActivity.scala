package com.brechtel.toaster

import _root_.android.app.Activity
import _root_.android.os.Bundle
import _root_.android.widget._

import AndroidImplicits._
import android.widget.Toast

class MainActivity extends Activity {
  def showMessageButton = findViewById(R.id.show_message).asInstanceOf[Button]
  def messageEditText = findViewById(R.id.message).asInstanceOf[EditText]

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity)
    showMessageButton.setOnClickListener(() => showMessage())
  }

  def showMessage() {
    Toast.makeText(this, messageEditText.getText, Toast.LENGTH_SHORT).show()
  }
}
