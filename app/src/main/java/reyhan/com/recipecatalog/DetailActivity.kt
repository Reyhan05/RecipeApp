package reyhan.com.recipecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import reyhan.com.recipecatalog.data.Recipes
import reyhan.com.recipecatalog.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val RECIPES_DATA = "recipes"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val dataRecipes = intent.getParcelableExtra<Recipes>(RECIPES_DATA) as Recipes

        binding.apply {
            tvCaloriesDetail.text = dataRecipes.calories
            tvDescriptionDetail.text = dataRecipes.description
            tvCarboDetail.text = dataRecipes.carbo
            tvNameRecipeDetail.text = dataRecipes.name
            tvProteinDetail.text = dataRecipes.protein
            tvInstructionLabel.text = dataRecipes.instructions
            tvIngredientsDetail.text = dataRecipes.ingredients
        }
        Glide.with(this).load(dataRecipes.photo).into(binding.imgDetail)

    }

    override fun onNavigateUp(): Boolean {
        return super.onNavigateUp()
        onBackPressed()
        return true
    }

}