package com.example.myapplication.patient

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class PatientViewModel(application: Application) : AndroidViewModel(application) {
    val allReserveUsers: LiveData<List<Patient>>
    val repository: PatientRepository = PatientRepository(application)

    init {
        allReserveUsers = repository.getReserveUsers()
    }

    fun getReserveUsers(): LiveData<List<Patient>> {
        return repository.getReserveUsers()
    }

    fun insertPatient(patient: Patient) {
        repository.insertPatient(patient)
    }

    fun deleteReserved(patient: Patient) {
        repository.deleteReserves(patient)
    }

    fun checkReserve(time: String, date: String): Boolean {
        return repository.checkReserve(time, date)
    }
}
