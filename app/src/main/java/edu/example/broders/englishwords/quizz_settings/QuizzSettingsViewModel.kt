package edu.example.broders.englishwords.quizz_settings

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import edu.example.broders.englishwords.database.RepertoireDatabaseDao

class QuizzSettingsViewModel(val database: RepertoireDatabaseDao, application: Application) : AndroidViewModel(application){
    private val _eventQuizzSetting = MutableLiveData<Boolean>()

    val eventQuizzSetting : LiveData<Boolean>
        get() = _eventQuizzSetting

    init{
        _eventQuizzSetting.value = false
    }

    fun onPlayQuizz() {
        Log.i("HomeViewModel","OnPlayQuizz clicked")
        _eventQuizzSetting.value = true
    }

    fun onPlayQuizzComplete() {
        _eventQuizzSetting.value = false
    }
}