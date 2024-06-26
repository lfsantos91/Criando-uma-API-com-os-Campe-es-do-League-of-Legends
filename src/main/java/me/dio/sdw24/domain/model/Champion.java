package me.dio.sdw24.domain.model;

public record Champion(
        Long id,
        String name,
        String role,
        String lore,
        String imageUrl
) {
    public String generateContextByQuestion(String question){
        return """
                Pergunta: %s
                nome do Campeão: %s
                Função: %s
                Lore (história): %s
                """.formatted(question, this.name, this.role, this.lore);
    }
}
