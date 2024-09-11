package com.ashutosh.fsd.Presentation


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ashutosh.fsd.Data.Repository
import com.ashutosh.fsd.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExploreViewModel @Inject constructor(private val repository: Repository): ViewModel() {

    val icons = listOf(
        R.drawable.amazon,
        R.drawable.microsoft,
        R.drawable.apple,
        R.drawable.google,
        R.drawable.netflix,
        R.drawable.tesla,
    )

    var isOpenFolderClick by mutableStateOf(false)
    var isList by mutableStateOf(true)

//    private val topGainerDao = StockApp.database.topGainerDao()
//    private val topLoserDao = StockApp.database.topLoserDao()
//    private val ticketSearchDao = StockApp.database.ticketSearchDao()
//
//    private val _getTopGainer = MutableLiveData<List<TopGainerD>>()
//    val getTopGainer: LiveData<List<TopGainerD>> = _getTopGainer
//
//    private val _getTopLoser = MutableLiveData<List<TopLoserD>>()
//    val getTopLoser: LiveData<List<TopLoserD>> = _getTopLoser
//
//    private val _getSearchesFromNetwork = MutableLiveData<List<TicketSearch>>()
//    val getSearchesFromNetwork: LiveData<List<TicketSearch>> = _getSearchesFromNetwork
//
//    private val _getSavedSearch = MutableLiveData<List<TicketSearchD>>()
//    val getSavedSearch: LiveData<List<TicketSearchD>> = _getSavedSearch
//
//    init {
//        viewModelScope.launch {
//            combine(
//                getAllTopGainerFromDatabase(),
//                getAllTopLoserFromDatabase(),
//                getAllSearchesFromDatabase()
//            ) { topGainers, topLosers, searches ->
//                Triple(topGainers, topLosers, searches)
//            }.collect { (topGainers, topLosers, searches) ->
//                _getTopGainer.value = topGainers
//                _getTopLoser.value = topLosers
//            }
//        }
//    }
//
//    private val _topGainAndLossResult = MutableStateFlow<NetworkResult<TopGainAndLossResponse>>(NetworkResult.Loading)
//    val topGainAndLoseResult: StateFlow<NetworkResult<TopGainAndLossResponse>> = _topGainAndLossResult
//
//    private val _ticketSearchResult = MutableStateFlow<NetworkResult<TicketSearchResponse>>(NetworkResult.Loading)
//    val ticketSearchResult: StateFlow<NetworkResult<TicketSearchResponse>> = _ticketSearchResult
//
//    fun getTopGainAndLose() {
//        val function = "TOP_GAINERS_LOSERS"
//        viewModelScope.launch {
//            repository.topGainAndLose(function,Constants.API_KEY)
//                .onStart {
//                    _topGainAndLossResult.value = NetworkResult.Loading
//                }
//                .catch { e ->
//                    _topGainAndLossResult.value = NetworkResult.Error(e.message ?: "Unknown error")
//                }
//                .collect { result ->
//                    _topGainAndLossResult.value =  result
//                    if (result is NetworkResult.Success) {
//                        result.data?.let { response ->
//                            Log.d("Top_Gainer_Loser_Fetch",response.toString())
//
//                            //Top Gainer Update
//
//                            val calendar: Calendar = Calendar.getInstance()
//                            calendar.add(Calendar.DAY_OF_YEAR , -3)
//                            val expirationLimit: Date = calendar.getTime()
//
//                            val topGainer = response.top_gainers.map { data ->
//
//                                TopGainerD(
//                                   data.ticker,
//                                    data.price,
//                                    data.change_percentage,
//                                    data.change_amount,
//                                    data.volume,
//                                    icons.random(),
//                                    expirationLimit.toString()
//                                )
//
//                            }
//                            insertOrUpdateTopGainerInDatabase(topGainer)
//
//
//
//                            //Top Loser Update
//                            val topLoser = response.top_losers.map { data ->
//
//                                TopLoserD(
//                                    data.ticker,
//                                    data.price,
//                                    data.change_percentage,
//                                    data.change_amount,
//                                    data.volume,
//                                    icons.random(),
//                                    expirationLimit.toString()
//                                )
//                            }
//                            insertOrUpdateTopLoserInDatabase(topLoser)
//
//
//                        }
//                    }
//                }
//        }
//    }
//
//    fun ticketSearch(keywords:String) {
//        val function = "SYMBOL_SEARCH"
//        viewModelScope.launch {
//            repository.ticketSearch(function,keywords,Constants.API_KEY)
//                .onStart {
//                    _ticketSearchResult.value = NetworkResult.Loading
//                }
//                .catch { e ->
//                    _ticketSearchResult.value = NetworkResult.Error(e.message ?: "Unknown error")
//                }
//                .collect { result ->
//                    _ticketSearchResult.value =  result
//                    if (result is NetworkResult.Success) {
//                        result.data?.let { response ->
//
//                            val ticketSearchData = response.bestMatches.map { data ->
//                                TicketSearch(
//                                    data.symbol,
//                                    data.name,
//                                )
//                            }
//                            Log.d("TICKET SEARCH DATA",ticketSearchData.toString())
//                            _getSearchesFromNetwork.value = ticketSearchData
//                        }
//                    }
//                }
//        }
//    }
//
//    private  fun getAllTopGainerFromDatabase(): Flow<List<TopGainerD>> {
//        return topGainerDao.getAllTopGainer()
//    }
//
//    private  fun getAllTopLoserFromDatabase(): Flow<List<TopLoserD>> {
//        return topLoserDao.getAllTopLoser()
//    }
//
//    private  fun getAllSearchesFromDatabase(): Flow<List<TicketSearchD>> {
//        return ticketSearchDao.getAllTicketSearch()
//    }
//
//
//    private suspend fun insertOrUpdateTopGainerInDatabase(topGains: List<TopGainerD>) {
//        Log.d("Top Gains are Inserted and Updated","---------Done--------")
//        topGainerDao.insertTopGainer(topGains)
//    }
//
//    private suspend fun insertOrUpdateTopLoserInDatabase(topLoses: List<TopLoserD>) {
//        Log.d("Top Loses are Inserted or Updated","--------Done---------")
//        topLoserDao.insertTopLoser(topLoses)
//    }
//
//    private suspend fun insertOrUpdateSearchesInDatabase(search: TicketSearchD) {
//        Log.d("Search is saved in App","---------Done--------")
//        ticketSearchDao.insertTicketSearch(search)
//    }

}
