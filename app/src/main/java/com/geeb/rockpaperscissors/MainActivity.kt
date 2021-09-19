package com.geeb.rockpaperscissors
import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val winnerChecker = WinnerChecker()
    var weaponPlayer = ""
    var weaponCom = ""

    @SuppressLint("UseCompatLoadingForDrawables")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Player
        val backgroundPlayer = resources.getDrawable(R.drawable.selector_bg_1, null)
        iv_rock_player.setOnClickListener {
            deleteBackgrounds(Constants.PLAYER)
            fl_rock_player.background = backgroundPlayer
            weaponPlayer = Constants.ROCK
            weaponCom = getWeaponComRandom()
            showWinner()
        }
        iv_paper_player.setOnClickListener {
            deleteBackgrounds(Constants.PLAYER)
            fl_paper_player.background = backgroundPlayer
            weaponPlayer = Constants.PAPER
            weaponCom = getWeaponComRandom()
            showWinner()
        }
        iv_scissors_player.setOnClickListener {
            deleteBackgrounds(Constants.PLAYER)
            fl_scissors_player.background = backgroundPlayer
            weaponPlayer = Constants.SCISSORS
            weaponCom = getWeaponComRandom()
            showWinner()
        }

        // Reset Game
        lottie_reset.setOnClickListener {
            lottie_reset.playAnimation()
            deleteBackgrounds(Constants.PLAYER)
            deleteBackgrounds(Constants.COM)
            lottie_vs.visibility = View.VISIBLE
            tv_winner.text = null
        }
    }

    // get Com
    @SuppressLint("UseCompatLoadingForDrawables")
    fun getWeaponComRandom(): String {
        val backgroundCom = resources.getDrawable(R.drawable.selector_bg_2, null)
        weaponCom = listOf(Constants.ROCK,Constants.PAPER,Constants.SCISSORS).random()
        if(weaponCom == Constants.ROCK){
            deleteBackgrounds(Constants.COM)
            fl_rock_com.background = backgroundCom
        }else if (weaponCom == Constants.PAPER) {
            deleteBackgrounds(Constants.COM)
            fl_paper_com.background = backgroundCom
        }else if (weaponCom == Constants.SCISSORS){
            deleteBackgrounds(Constants.COM)
            fl_scissors_com.background = backgroundCom
        }
        return weaponCom
    }

    fun showWinner(){
        val winner = winnerChecker.getWinner(weaponPlayer, weaponCom)
        tv_winner.text = winner
        tv_winner.visibility = View.VISIBLE
        lottie_vs.visibility = View.INVISIBLE
    }

    private fun deleteBackgrounds(participant: String){
        if (participant == Constants.PLAYER){
            fl_rock_player.background = null
            fl_paper_player.background = null
            fl_scissors_player.background = null
        }
        if (participant == Constants.COM){
            fl_rock_com.background = null
            fl_paper_com.background = null
            fl_scissors_com.background = null
        }
    }
}