package fr.tblf.patterns.strategy.crypto.comportements

import java.security.MessageDigest

class MD5 : CryptoStrat {
    private val messageDigest: MessageDigest = MessageDigest.getInstance("MD5")

    override fun encrypt(message: String) {
        println(String(messageDigest.digest(message.toByteArray())))
    }
}