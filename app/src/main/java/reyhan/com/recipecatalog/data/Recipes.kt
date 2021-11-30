package reyhan.com.recipecatalog.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Recipes(
    var name: String?,
    var category: String?,
    var description: String?,
    var ingredients: String?,
    var instructions: String?,
    var photo: String?,
    var price: String?,
    var calories: String?,
    var carbo: String?,
    var protein: String?
) : Parcelable