package com.example.android_language_practice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_language_practice.databinding.FragmentDaysBinding

class DaysFragment : Fragment() {
    private var _binding: FragmentDaysBinding? = null
    private val binding get() = _binding!!

    private var firstCheck = 0
    private var answerCorrect = 0
    private var totalQuestions = 0
    private var correctAnswerTotal = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDaysBinding.inflate(inflater, container, false)
        displayDaysQuestion()
        binding.continueButton.visibility = View.INVISIBLE
        binding.finishButton.visibility = View.INVISIBLE
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.answerButton.setOnClickListener{
            checkInputAnswer()
        }
        binding.continueButton.setOnClickListener{
            setNewQuestion()
        }
        binding.finishButton.setOnClickListener{
            findNavController().navigate(R.id.action_daysFragment_to_homeFragment)
        }
        return binding.root
    }

    private fun setNewQuestion() {
        binding.answerBox.text.clear()
        binding.answerButton.visibility = View.VISIBLE
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        when(binding.dayText.text){
            getString(R.string.days_monday) -> {
                binding.dayText.text = getString(R.string.days_tuesday_display)
                binding.dayText.tag = getString(R.string.days_tuesday)
            }
            getString(R.string.days_tuesday) -> {
                binding.dayText.text = getString(R.string.days_wednesday_display)
                binding.dayText.tag = getString(R.string.days_wednesday)
            }
            getString(R.string.days_wednesday) -> {
                binding.dayText.text = getString(R.string.days_thursday_display)
                binding.dayText.tag = getString(R.string.days_thursday)
            }
            getString(R.string.days_thursday) -> {
                binding.dayText.text = getString(R.string.days_friday_display)
                binding.dayText.tag = getString(R.string.days_friday)
            }
            getString(R.string.days_friday) -> {
                binding.dayText.text = getString(R.string.days_saturday_display)
                binding.dayText.tag = getString(R.string.days_saturday)
            }
            getString(R.string.days_saturday) -> {
                binding.dayText.text = getString(R.string.days_sunday_display)
                binding.dayText.tag = getString(R.string.days_sunday)
            }
            else -> {
                binding.dayText.visibility = View.INVISIBLE
                binding.dayQuestion.visibility = View.INVISIBLE
                binding.answerBox.visibility = View.INVISIBLE
                binding.answerButton.visibility = View.INVISIBLE
                binding.continueButton.visibility = View.INVISIBLE

                binding.answerDisplay.setText(getString(R.string.days_question_correct, correctAnswerTotal, totalQuestions))
                binding.answerDisplay.visibility = View.VISIBLE

                binding.finishButton.visibility = View.VISIBLE
            }
        }
    }

    private fun displayDaysQuestion() {
        if(firstCheck == 0){
            binding.dayText.text = getString(R.string.days_monday_display)
            binding.dayText.tag = getString(R.string.days_monday)
            binding.answerBox.text.clear()
            binding.answerBox.setHint(R.string.days_hint)
            firstCheck = 1
        }
        else{}
    }

    private fun checkInputAnswer() {
        val inputText = binding.answerBox.text.toString()
        val currentQuestion = binding.dayText.tag.toString()
        var correctAnswerMessage = ""
        when(currentQuestion){
            getString(R.string.days_monday) -> {
                binding.answerDisplay.setText(R.string.days_monday_sentence)
                binding.dayText.setText(R.string.days_monday)
                if(inputText == getString(R.string.days_monday) || inputText == getString(R.string.days_monday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_monday_sentence))
                }
            }
            getString(R.string.days_tuesday) -> {
                binding.answerDisplay.setText(R.string.days_tuesday_sentence)
                binding.dayText.setText(R.string.days_tuesday)
                if(inputText == getString(R.string.days_tuesday) || inputText == getString(R.string.days_tuesday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_tuesday_sentence))
                }
            }
            getString(R.string.days_wednesday) -> {
                binding.answerDisplay.setText(R.string.days_wednesday_sentence)
                binding.dayText.setText(R.string.days_wednesday)
                if(inputText == getString(R.string.days_wednesday) || inputText == getString(R.string.days_wednesday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_wednesday_sentence))
                }
            }
            getString(R.string.days_thursday) -> {
                binding.answerDisplay.setText(R.string.days_thursday_sentence)
                binding.dayText.setText(R.string.days_thursday)
                if(inputText == getString(R.string.days_thursday) || inputText == getString(R.string.days_thursday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_thursday_sentence))
                }
            }
            getString(R.string.days_friday) -> {
                binding.answerDisplay.setText(R.string.days_friday_sentence)
                binding.dayText.setText(R.string.days_friday)
                if(inputText == getString(R.string.days_friday) || inputText == getString(R.string.days_friday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_friday_sentence))
                }
            }
            getString(R.string.days_saturday) -> {
                binding.answerDisplay.setText(R.string.days_saturday_sentence)
                binding.dayText.setText(R.string.days_saturday)
                if(inputText == getString(R.string.days_saturday) || inputText == getString(R.string.days_saturday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_saturday_sentence))
                }
            }
            getString(R.string.days_sunday) -> {
                binding.answerDisplay.setText(R.string.days_sunday_sentence)
                binding.dayText.setText(R.string.days_sunday)
                if(inputText == getString(R.string.days_sunday) || inputText == getString(R.string.days_sunday_sentence)){
                    answerCorrect = 1
                    correctAnswerMessage = getString(R.string.days_answer_message_correct)
                }
                else{
                    answerCorrect = 0
                    correctAnswerMessage = getString(R.string.days_answer_message_incorrect, inputText, getString(R.string.days_sunday_sentence))
                }
            }
            else -> {
                Log.i("MATCH", "no match")
                correctAnswerMessage = getString(R.string.error_message_answer)
            }
        }
        totalQuestions++
        binding.answerDisplay.text = correctAnswerMessage
        displayQuestionResult(answerCorrect)
    }

    private fun displayQuestionResult(answerCorrect: Int) {
        binding.answerButton.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.VISIBLE
        binding.answerDisplay.visibility = View.VISIBLE
        when(answerCorrect){
            0 -> {
                //not correct answer input
                Log.i("displayAnswer", "not correct")
            }
            1 -> {
                //correct answer input
                correctAnswerTotal++
                Log.i("displayAnswer", "correct")
            }
            else -> {
                //error
                Log.i("ERROR", "ERROR CHECKING ANSWER MATCH")
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}