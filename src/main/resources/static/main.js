const quizContainer = document.getElementById('quiz');
const navigationSidebar = document.getElementById('sidebar')
const submitButton = document.getElementById('submit');

const myQuestions = [
  {
    question: "Who is the strongest?",
    answers: {
      a: "Supermanasdjfkalalalala  lalalalala lalalalalalalalalalalal",
      b: "The Terminator",
      c: "Waluigi, obviously"
    },
    correctAnswer: "c"
  },
  {
    question: "What is the best site ever created?",
    answers: {
      a: "SitePoint",
      b: "Simple Steps Code",
      c: "Trick question; they're both the best"
    },
    correctAnswer: "c"
  },
  {
    question: "Where is Waldo really?",
    answers: {
      a: "Antarctica",
      b: "Exploring the Pacific Ocean",
      c: "Sitting in a tree",
      d: "Minding his own business, so stop asking"
    },
    correctAnswer: "d"
  }
];

function createSidebarTab(label){

}

function buildQuiz(){

  // we'll need a place to store the HTML output
  const output = [];
  const sidebar = [];

  // for each question...
  myQuestions.forEach(
    (currentQuestion, questionNumber) => {

      sidebar.push(
      	`<span class="sidetab" onclick="showSlide(${questionNumber})">${questionNumber+1}</span>`)
      // we'll want to store the list of answer choices
      const answers = [];

      // and for each available answer...
      for(letter in currentQuestion.answers){

        // ...add an HTML radio button
        answers.push(
/*          `<label>
            <input type="radio" name="question${questionNumber}" value="${letter}">
            ${letter} :
            ${currentQuestion.answers[letter]}
          </label>`*/

          `<input type="radio" name="question${questionNumber}" id="q${questionNumber}${letter}" value="${letter}">
          <label class="four col" for="q${questionNumber}${letter}">${currentQuestion.answers[letter]}</label>`

        );
      }

      // add this question and its answers to the output
      output.push(
        `<div class="slide cf">
        <div class="question"> ${currentQuestion.question} </div>
        <div class="answers cf"> ${answers.join('')} </div>
        </div>`
      );
    }
  );

  navigationSidebar.innerHTML = sidebar.join('');
  // finally combine our output list into one string of HTML and put it on the page
  quizContainer.innerHTML = output.join('');
}


function showResults(){

  // gather answer containers from our quiz
  const answerContainers = quizContainer.querySelectorAll('.answers');

  // keep track of user's answers
  let numCorrect = 0;

  // for each question...
  myQuestions.forEach( (currentQuestion, questionNumber) => {

    // find selected answer
    const answerContainer = answerContainers[questionNumber];
    const selector = 'input[name=question'+questionNumber+']:checked';
    const userAnswer = (answerContainer.querySelector(selector) || {}).value;

    // if answer is correct
    if(userAnswer===currentQuestion.correctAnswer){
      // add to the number of correct answers
      numCorrect++;

      // color the answers green
      answerContainers[questionNumber].style.color = 'lightgreen';
    }
    // if answer is wrong or blank
    else{
      // color the answers red
      answerContainers[questionNumber].style.color = 'red';
    }
  });

  // show number of correct answers out of total
  resultsContainer.innerHTML = numCorrect + ' out of ' + myQuestions.length;
}

buildQuiz();

submitButton.addEventListener('click', showResults);

/* Question navigation */
const previousButton = document.getElementById("previous")
const nextButton = document.getElementById("next")
const slides = document.querySelectorAll(".slide")
const sideTabs = document.querySelectorAll(".sidebar span")
let currentSlide = 0

function showSlide(n) {
  document.querySelector('.active').classList.remove('active');
  sideTabs[n].classList.add('active');
  //----------------------------------- 
  slides[currentSlide].classList.remove('active-slide');
  slides[n].classList.add('active-slide');
  currentSlide = n;
  //remove previous button if on first queston
  if(currentSlide===0){
    previousButton.disabled = true;
  }
  else{
    previousButton.disabled = false;
  }
  //remove next button if on last question
  if(currentSlide===slides.length-1){
    nextButton.disabled = true;
    submitButton.style.display = 'inline-block';
  }
  else{
    nextButton.disabled = false;
    submitButton.style.display = 'none';
  }
}
showSlide(0);

function showNextSlide() {
  showSlide(currentSlide + 1);
}

function showPreviousSlide() {
  showSlide(currentSlide - 1);
}

previousButton.addEventListener("click", showPreviousSlide);
nextButton.addEventListener("click", showNextSlide);