find . -name "docker-compose.yml" -exec dirname {} \; | while read -r service; do
  echo "Subindo $(basename "$service")..."
  (
    cd "$service" && docker-compose up -d
  ) || {
    echo "Erro ao subir o serviço $(basename "$service"). Continuando para o próximo..."
    continue
  }
done

echo "Todos os microsserviços foram iniciados."