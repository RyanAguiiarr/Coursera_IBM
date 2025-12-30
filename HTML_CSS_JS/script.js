function addRecommendation() {
  // Pegar o valor do input
  let recommendationText = document.getElementById("new-rec-text").value;

  // Verificar se não está vazio
  if (recommendationText.trim() !== "") {
    // Tarefa 7: Adicionar à lista existente
    let recList = document.getElementById("rec-list");
    let newCard = document.createElement("div");

    newCard.classList.add("rec-card");
    newCard.textContent = `"${recommendationText}" - Visitante`;

    recList.appendChild(newCard);

    // Tarefa 9: Exibir Popup de confirmação
    alert("Obrigado por deixar uma recomendação!");

    // Limpar o campo
    document.getElementById("new-rec-text").value = "";
  }
}
