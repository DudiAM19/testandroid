package com.example.test

import com.google.gson.annotations.SerializedName

data class ResponseApi(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("url")
	val url: String? = null
)
