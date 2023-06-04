package com.example.android_language_practice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_language_practice.databinding.FragmentNumbersBinding

class NumbersFragment : Fragment() {
    private var _binding: FragmentNumbersBinding? = null
    private val binding get() = _binding!!

    private var answerCorrect = 0
    private var totalQuestions = 0
    private var correctAnswerTotal = 0
    private var selectedNumberType = 0  //0 no selection/error, 1 native, 2 sino

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNumbersBinding.inflate(inflater, container, false)
        binding.numText.visibility = View.INVISIBLE
        binding.answerBox.visibility = View.INVISIBLE
        binding.answerButton.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        binding.finishButton.visibility = View.INVISIBLE
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.sinoButton.setOnClickListener{
            startSino()
        }
        binding.nativeButton.setOnClickListener{
            startNative()
        }
        binding.answerButton.setOnClickListener{
            checkInputAnswer()
        }
        binding.continueButton.setOnClickListener{
            setNewQuestion()
        }
        binding.finishButton.setOnClickListener{
            findNavController().navigate(R.id.action_numbersFragment_to_homeFragment)
        }
        return binding.root
    }

    private fun startNative() {
        binding.sinoButton.visibility = View.INVISIBLE
        binding.nativeButton.visibility = View.INVISIBLE
        selectedNumberType = 1
        displayNumbersQuestion()
    }

    private fun startSino() {
        binding.sinoButton.visibility = View.INVISIBLE
        binding.nativeButton.visibility = View.INVISIBLE
        selectedNumberType = 2
        displayNumbersQuestion()
    }

    private fun displayNumbersQuestion() {
        if(selectedNumberType == 1){     //NATIVE
            binding.numText.text = getString(R.string.numbers_1)
            binding.numText.tag = getString(R.string.numbers_1_native)
            binding.answerBox.text.clear()
            binding.answerBox.setHint(R.string.native_label)
            binding.numText.visibility = View.VISIBLE
            binding.answerBox.visibility = View.VISIBLE
            binding.answerButton.visibility = View.VISIBLE
        }
        else if(selectedNumberType == 2){       //SINO
            binding.numText.text = getString(R.string.numbers_1)
            binding.numText.tag = getString(R.string.numbers_1_sino)
            binding.answerBox.text.clear()
            binding.answerBox.setHint(R.string.sino_label)
            binding.numText.visibility = View.VISIBLE
            binding.answerBox.visibility = View.VISIBLE
            binding.answerButton.visibility = View.VISIBLE
        }
        else{
            binding.answerDisplay.text = getString(R.string.error_message_buttons)
            binding.answerDisplay.visibility = View.VISIBLE
            binding.finishButton.visibility = View.VISIBLE
        }
    }

    private fun setNewQuestion() {
        binding.answerBox.text.clear()
        binding.answerButton.visibility = View.VISIBLE
        binding.answerDisplay.visibility = View.INVISIBLE
        binding.continueButton.visibility = View.INVISIBLE
        when(binding.numText.text){
            getString(R.string.numbers_1) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_2)
                    binding.numText.tag = getString(R.string.numbers_2_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_2)
                    binding.numText.tag = getString(R.string.numbers_2_sino)
                }
                else{}
            }
            getString(R.string.numbers_2) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_3)
                    binding.numText.tag = getString(R.string.numbers_3_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_3)
                    binding.numText.tag = getString(R.string.numbers_3_sino)
                }
                else{}
            }
            getString(R.string.numbers_3) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_4)
                    binding.numText.tag = getString(R.string.numbers_4_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_4)
                    binding.numText.tag = getString(R.string.numbers_4_sino)
                }
                else{}
            }
            getString(R.string.numbers_4) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_5)
                    binding.numText.tag = getString(R.string.numbers_5_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_5)
                    binding.numText.tag = getString(R.string.numbers_5_sino)
                }
                else{}
            }
            getString(R.string.numbers_5) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_6)
                    binding.numText.tag = getString(R.string.numbers_6_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_6)
                    binding.numText.tag = getString(R.string.numbers_6_sino)
                }
                else{}
            }
            getString(R.string.numbers_6) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_7)
                    binding.numText.tag = getString(R.string.numbers_7_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_7)
                    binding.numText.tag = getString(R.string.numbers_7_sino)
                }
                else{}
            }
            getString(R.string.numbers_7) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_8)
                    binding.numText.tag = getString(R.string.numbers_8_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_8)
                    binding.numText.tag = getString(R.string.numbers_8_sino)
                }
                else{}
            }
            getString(R.string.numbers_8) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_9)
                    binding.numText.tag = getString(R.string.numbers_9_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_9)
                    binding.numText.tag = getString(R.string.numbers_9_sino)
                }
                else{}
            }
            getString(R.string.numbers_9) -> {
                if(selectedNumberType == 1){        //NATIVE
                    binding.numText.text = getString(R.string.numbers_10)
                    binding.numText.tag = getString(R.string.numbers_10_native)
                }
                else if(selectedNumberType == 2){   //SINO
                    binding.numText.text = getString(R.string.numbers_10)
                    binding.numText.tag = getString(R.string.numbers_10_sino)
                }
                else{}
            }
            else -> {
                binding.numText.visibility = View.INVISIBLE
                binding.answerBox.visibility = View.INVISIBLE
                binding.answerButton.visibility = View.INVISIBLE
                binding.continueButton.visibility = View.INVISIBLE

                binding.answerDisplay.setText(getString(R.string.days_question_correct, correctAnswerTotal, totalQuestions))
                binding.answerDisplay.visibility = View.VISIBLE

                binding.finishButton.visibility = View.VISIBLE
            }
        }
    }

    private fun checkInputAnswer() {
        val inputText = binding.answerBox.text.toString()
        val currentQuestion = binding.numText.text.toString()
        var correctAnswerMessage = ""
        when(currentQuestion){
            getString(R.string.numbers_1) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_1_native)
                    if(inputText == getString(R.string.numbers_1_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_1_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_1_sino)
                    if(inputText == getString(R.string.numbers_1_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_1_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_2) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_2_native)
                    if(inputText == getString(R.string.numbers_2_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_2_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_2_sino)
                    if(inputText == getString(R.string.numbers_2_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_2_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_3) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_3_native)
                    if(inputText == getString(R.string.numbers_3_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_3_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_3_sino)
                    if(inputText == getString(R.string.numbers_3_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_3_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_4) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_4_native)
                    if(inputText == getString(R.string.numbers_4_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_4_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_4_sino)
                    if(inputText == getString(R.string.numbers_4_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_4_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_5) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_5_native)
                    if(inputText == getString(R.string.numbers_5_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_5_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_5_sino)
                    if(inputText == getString(R.string.numbers_5_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_5_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_6) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_6_native)
                    if(inputText == getString(R.string.numbers_6_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_6_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_6_sino)
                    if(inputText == getString(R.string.numbers_6_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_6_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_7) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_7_native)
                    if(inputText == getString(R.string.numbers_7_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_7_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_7_sino)
                    if(inputText == getString(R.string.numbers_7_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_7_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_8) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_8_native)
                    if(inputText == getString(R.string.numbers_8_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_8_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_8_sino)
                    if(inputText == getString(R.string.numbers_8_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_8_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_9) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_9_native)
                    if(inputText == getString(R.string.numbers_9_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_9_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_9_sino)
                    if(inputText == getString(R.string.numbers_9_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_9_sino))
                    }
                }
                else{}
            }
            getString(R.string.numbers_10) -> {
                if(selectedNumberType == 1){    //NATIVE
                    binding.answerDisplay.setText(R.string.numbers_10_native)
                    if(inputText == getString(R.string.numbers_10_native)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_10_native))
                    }
                }
                else if(selectedNumberType == 2) {    //SINO
                    binding.answerDisplay.setText(R.string.numbers_10_sino)
                    if(inputText == getString(R.string.numbers_10_sino)){
                        answerCorrect = 1
                        correctAnswerMessage = getString(R.string.numbers_answer_message_correct)
                    }
                    else{
                        answerCorrect = 0
                        correctAnswerMessage = getString(R.string.numbers_answer_message_incorrect, inputText, getString(R.string.numbers_10_sino))
                    }
                }
                else{}
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