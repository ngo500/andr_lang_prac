package com.example.android_language_practice

import android.annotation.SuppressLint
import android.os.Bundle
import android.text.Spannable
import android.text.style.ForegroundColorSpan
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.text.set
import androidx.core.text.toSpannable
import androidx.navigation.fragment.findNavController
import com.example.android_language_practice.databinding.FragmentLocationBinding
import java.util.Locale

class LocationFragment : Fragment() {

    private var _binding: FragmentLocationBinding? = null
    private val binding get() = _binding!!
    private lateinit var currentView: ImageView
    private var firstCheck = 0
    private var answerCorrect = 0
    private var correctAnswerTotal = 0
    private var totalQuestions = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setLanguage("ko-rKR")
        _binding = FragmentLocationBinding.inflate(inflater, container, false)
        displayLocationQuestion()
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.incorrectAnswerDisplay.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        binding.finishButton.visibility = View.INVISIBLE
        binding.answerButton.setOnClickListener{
            checkInputAnswer(it)
        }
        binding.continueButton.setOnClickListener{
            setNewQuestion()
        }
        binding.finishButton.setOnClickListener{
            findNavController().navigate(R.id.action_locationFragment_to_homeFragment)
        }
        return binding.root
    }

    private fun setLanguage(language: String) {
        val locale =  Locale(language)
        Locale.setDefault(locale)

        val res = requireContext().resources

        val configs = res.configuration
        configs.locale = locale
        configs.setLayoutDirection(locale)

        res.updateConfiguration(configs, res.displayMetrics)
    }

    private fun checkInputAnswer(view: View) {
        val inputText = binding.answerBox.text.toString()
        val currentQuestion = binding.questionImage.tag.toString()
        var correctAnswerMessage: String
        var answerStr = ""
        when(currentQuestion){
            R.string.image_name_1.toString() -> {
                binding.answerDisplay.setText(R.string.answer_1)
                if(inputText == getString(R.string.answer_1)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_1)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_1))
                }
            }
            R.string.image_name_2.toString() -> {
                binding.answerDisplay.setText(R.string.answer_2)
                if(inputText == getString(R.string.answer_2)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_2)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_2))
                }
            }
            R.string.image_name_3.toString() -> {
                binding.answerDisplay.setText(R.string.answer_3)
                if(inputText == getString(R.string.answer_3)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_3)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_3))
                }
            }
            R.string.image_name_4.toString() -> {
                binding.answerDisplay.setText(R.string.answer_4)
                if(inputText == getString(R.string.answer_4)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_4)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_4))
                }
            }
            R.string.image_name_5.toString() -> {
                binding.answerDisplay.setText(R.string.answer_5)
                if(inputText == getString(R.string.answer_5)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_5)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_5))
                }
            }
            R.string.image_name_6.toString() -> {
                binding.answerDisplay.setText(R.string.answer_6)
                if(inputText == getString(R.string.answer_6)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_6)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_6))
                }
            }
            R.string.image_name_7.toString() -> {
                binding.answerDisplay.setText(R.string.answer_7)
                if(inputText == getString(R.string.answer_7)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_7)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_7))
                }
            }
            R.string.image_name_8.toString() -> {
                binding.answerDisplay.setText(R.string.answer_8)
                if(inputText == getString(R.string.answer_8)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_8)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_8))
                }
            }
            R.string.image_name_9.toString() -> {
                binding.answerDisplay.setText(R.string.answer_9)
                if(inputText == getString(R.string.answer_9)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_9)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_9))
                }
            }
            R.string.image_name_10.toString() -> {
                binding.answerDisplay.setText(R.string.answer_10)
                if(inputText == getString(R.string.answer_10)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_10)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_10))
                }
            }
            R.string.image_name_11.toString() -> {
                binding.answerDisplay.setText(R.string.answer_11)
                if(inputText == getString(R.string.answer_11)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    answerStr = getString(R.string.answer_11)
                    correctAnswerMessage = getString(R.string.answer_message_incorrect, getString(R.string.answer_11))
                }
            }
            else -> {
                Log.i("MATCH", "no match")
                correctAnswerMessage = R.string.error_message_answer.toString()
            }
        }
        totalQuestions++
        binding.answerDisplay.text = correctAnswerMessage
        displayQuestionResult(answerCorrect, answerStr)
    }

    private fun displayQuestionResult(answerCorrect: Int, answerStr: String) {
        binding.answerButton.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.VISIBLE
        when(answerCorrect){
            0 -> {
                //not correct answer input
                Log.i("displayAnswer", "not correct")
                parseIncorrectAnswer(answerStr)
            }
            1 -> {
                //correct answer input
                binding.answerDisplay.visibility = View.VISIBLE
                correctAnswerTotal++
                Log.i("displayAnswer", "correct")
            }
            else -> {
                //error
                Log.i("ERROR", "ERROR CHECKING ANSWER MATCH")
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun parseIncorrectAnswer(answerStr: String) {
        val tempStr = binding.answerBox.text.toString()
        var wrongIndex = -999
        var ctr = 0

        if(tempStr.isNotEmpty()){
            for (x in answerStr) {

                if (wrongIndex < 0){
                    if (tempStr[ctr] != x){
                        wrongIndex = ctr
                    }
                    else{}
                }
                else{}
                ctr++
            }
        }
        else{ }

        if(wrongIndex in 0..ctr && ctr == tempStr.length){
            //TODO: Display text at incorrect portion as red
            Log.i("Color", "adding color")
            //val colorComp = tempStr.toSpannable()
            //val foreColor = ForegroundColorSpan(R.color.red)
            //colorComp.setSpan(foreColor, wrongIndex, ctr, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            binding.incorrectAnswerDisplay.text = getString(R.string.wrong_answer_holder,
                getString(R.string.answer_message_comparison_1),
                tempStr,
                getString(R.string.answer_message_comparison_2, answerStr))
        }
        else{
            Log.i("Color", "no color")
            binding.incorrectAnswerDisplay.text = getString(R.string.wrong_answer_holder,
                getString(R.string.answer_message_comparison_1),
                tempStr,
                getString(R.string.answer_message_comparison_2, answerStr))
        }
        binding.incorrectAnswerDisplay.visibility = View.VISIBLE
    }

    private fun displayLocationQuestion(){
        if(firstCheck == 0){
            binding.questionImage.setImageResource(R.drawable.question_image_1)
            binding.questionImage.tag = R.string.image_name_1
            binding.answerBox.setHint(R.string.hint_1)
            firstCheck = 1
        }
        else{}
        when(binding.questionImage.tag.toString()){
            "question_image_8" -> binding.questionText.setText(R.string.question_message_alt)
            "question_image_5" -> binding.questionText.setText(R.string.question_message_alt_2)
            else -> binding.questionText.setText(R.string.question_message)
        }
    }

    private fun setNewQuestion(){
        binding.answerBox.text.clear()
        binding.answerButton.visibility = View.VISIBLE
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.incorrectAnswerDisplay.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        when(binding.questionImage.tag.toString()){
            R.string.image_name_1.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_2)
                binding.questionImage.tag = R.string.image_name_2
                binding.answerBox.setHint(R.string.hint_2)
            }
            R.string.image_name_2.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_3)
                binding.questionImage.tag = R.string.image_name_3
                binding.answerBox.setHint(R.string.hint_3)
            }
            R.string.image_name_3.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_4)
                binding.questionImage.tag = R.string.image_name_4
                binding.answerBox.setHint(R.string.hint_4)
            }
            R.string.image_name_4.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_5)
                binding.questionImage.tag = R.string.image_name_5
                binding.answerBox.setHint(R.string.hint_5)
            }
            R.string.image_name_5.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_6)
                binding.questionImage.tag = R.string.image_name_6
                binding.answerBox.setHint(R.string.hint_6)
            }
            R.string.image_name_6.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_7)
                binding.questionImage.tag = R.string.image_name_7
                binding.answerBox.setHint(R.string.hint_7)
            }
            R.string.image_name_7.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_8)
                binding.questionImage.tag = R.string.image_name_8
                binding.answerBox.setHint(R.string.hint_8)
                binding.questionText.setText(R.string.question_message_alt)
            }
            R.string.image_name_8.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_9)
                binding.questionImage.tag = R.string.image_name_9
                binding.answerBox.setHint(R.string.hint_9)
                binding.questionText.setText(R.string.question_message)
            }
            R.string.image_name_9.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_10)
                binding.questionImage.tag = R.string.image_name_10
                binding.answerBox.setHint(R.string.hint_10)
            }
            R.string.image_name_10.toString() -> {
                binding.questionImage.setImageResource(R.drawable.question_image_11)
                binding.questionImage.tag = R.string.image_name_11
                binding.answerBox.setHint(R.string.hint_11)
            }
            else -> {
                binding.questionImage.visibility = View.INVISIBLE
                binding.questionText.visibility = View.INVISIBLE
                binding.answerBox.visibility = View.INVISIBLE
                binding.answerButton.visibility = View.INVISIBLE
                binding.continueButton.visibility = View.INVISIBLE

                binding.answerDisplay.setText(getString(R.string.question_correct, correctAnswerTotal, totalQuestions))
                binding.answerDisplay.visibility = View.VISIBLE

                binding.finishButton.visibility = View.VISIBLE
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}