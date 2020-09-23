package fr.tblf.patterns.strategy.crypto.comportements

import java.security.MessageDigest

class SHA512 : CryptoStrat {
    private val messageDigest: MessageDigest = MessageDigest.getInstance("SHA-512")

    override fun encrypt(message: String) {
        println(String(messageDigest.digest(message.toByteArray())))
    }
}