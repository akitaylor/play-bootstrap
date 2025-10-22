package views.b4.my.vertical

import views.html.b4.B4FieldConstructor

object FieldConstructors {
  given horizontalFC_4_8: B4FieldConstructor =
    views.html.b4.horizontal.fieldConstructor("col-md-4", "col-md-8")
  given horizontalFC_2_10: B4FieldConstructor =
    views.html.b4.horizontal.fieldConstructor("col-md-2", "col-md-10")
}