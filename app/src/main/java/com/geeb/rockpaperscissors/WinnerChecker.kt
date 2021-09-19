package com.geeb.rockpaperscissors

class WinnerChecker {
    fun getWinner(weaponPlayer: String, weaponCom: String): String {
        return when {
            ((weaponPlayer== Constants.ROCK && weaponCom == Constants.SCISSORS) ||
                    (weaponPlayer == Constants.PAPER && weaponCom == Constants.ROCK) ||
                        (weaponPlayer == Constants.SCISSORS && weaponCom == Constants.PAPER)) -> {
                Constants.PLAYER_WIN
            }
            ((weaponPlayer == Constants.ROCK && weaponCom == Constants.PAPER) ||
                    (weaponPlayer == Constants.PAPER && weaponCom == Constants.SCISSORS) ||
                        (weaponPlayer == Constants.SCISSORS && weaponCom == Constants.ROCK)) -> {
                Constants.COM_WIN
            }
            else -> {
                Constants.DRAW
            }
        }
    }
}


