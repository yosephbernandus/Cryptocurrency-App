package mobile.android.cryptocurrencyapp.data.repository

import mobile.android.cryptocurrencyapp.data.remote.CoinPaprikaApi
import mobile.android.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import mobile.android.cryptocurrencyapp.data.remote.dto.CoinDto
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}