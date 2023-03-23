const startButton = document.getElementById('start-btn')
const nextButton = document.getElementById('next-btn')
const questionContainerElement = document.getElementById('question-container')

const questionElement = document.getElementById('question')
const answerButtonsElement = document.getElementById('answer-buttons')

let shuffledQuestions, currentQuestionIndex

startButton.addEventListener('click', startGame)
nextButton.addEventListener('click', () => {
    currentQuestionIndex++
    setNextQuestion()
})

function startGame(){
    console.log('Started')
    startButton.classList.add('hide')
    shuffledQuestions = questions.sort(() => Math.random() -0.5)
    currentQuestionIndex = 0
    questionContainerElement.classList.remove('hide')
    setNextQuestion()
}

function setNextQuestion() {
    resetState()

    showQuestion(shuffledQuestions[currentQuestionIndex])
    
    
}

function showQuestion(question){
    questionElement.innerText =question.question
    question.answers.forEach(answer => {
        const button = document.createElement('button')
        button.innerText = answer.text
        
        button.classList.add('btn')
        
        if (answer.correct) {
            button.dataset.correct = answer.correct
        }
        button.addEventListener('click', selectAnswer)
        
        answerButtonsElement.appendChild(button)
    })
}

function resetState() {
    
    clearStatusClass(document.body)
    nextButton.classList.add('hide')
    
    while (answerButtonsElement.firstChild){
        
        answerButtonsElement.removeChild
        (answerButtonsElement.firstChild)
    }
}

function selectAnswer(e) {
    const selectedButton = e.target
    const correct =selectedButton.dataset.correct
    setStatusClass(document.body, correct)
    Array.from(answerButtonsElement.children).forEach(button => {
        setStatusClass(button, button.dataset.correct)
    })
    if(shuffledQuestions.length > currentQuestionIndex + 1) {
        nextButton.classList.remove('hide')
    }else{
        startButton.innerText = 'Restart'
        startButton.classList.remove('hide')
    }
    
}

function setStatusClass(element, correct) {
    clearStatusClass(element)
    if(correct){
        element.classList.add('correct')
    }else{
        element.classList.add('wrong')
    }
}

function clearStatusClass(element) {
    element.classList.remove('correct')
    element.classList.remove('wrong')
}

const questions = [
    {
      question: 'What Vietnamese food came from Da Nang?',
      answers: [
        { text: 'Bun Bo Hue', correct: false },
        { text: 'Pho', correct: false },
        { text: 'Banh Trang Nưong', correct: false },
        { text: 'Mi Quang', correct: true }
      ]
    },
    {
      question: 'What Vietnamese food came from Hue?',
      answers: [
        { text: 'Bun Bo Hue', correct: true },
        { text: 'Pho', correct: false },
        { text: 'Banh Trang Nưong', correct: false },
        { text: 'Mi Quang', correct: false }
      ]
    },
    {
      question: 'What Vietnamese food came from Da Lat?',
      answers: [
        { text: 'Bun Bo Hue', correct: false },
        { text: 'Pho', correct: false },
        { text: 'Banh Trang Nuong', correct: true },
        { text: 'Mi Quang', correct: false }
      ]
    },
    {
      question: 'What Vietnamese food came from Hanoi?',
      answers: [
        { text: 'Bun Bo Hue', correct: false },
        { text: 'Pho', correct: true },
        { text: 'Banh Trang Nuong', correct: false },
        { text: 'Mi Quang', correct: false }
      ]
    },
    {
      question: 'What Vietnamese food came from Ho Chi Minh City?',
      answers: [
        { text: 'Bun Bo Hue', correct: false },
        { text: 'Banh Mi', correct: true },
        { text: 'Banh Trang Nuong', correct: false },
        { text: 'Mi Quang', correct: false }
      ]
    },
  ]