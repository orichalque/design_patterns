package fr.tblf.patterns.strategy.crypto.comportements

import java.security.MessageDigest

class SHA256: CryptoStrat {
    private val messageDigest: MessageDigest = MessageDigest.getInstance("SHA-256")

    override fun encrypt(message: String) {
        println(String(messageDigest.digest(message.toByteArray())))
    }
}