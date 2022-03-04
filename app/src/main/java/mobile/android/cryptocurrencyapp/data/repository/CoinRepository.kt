package mobile.android.cryptocurrencyapp.data.repository

import mobile.android.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import mobile.android.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}