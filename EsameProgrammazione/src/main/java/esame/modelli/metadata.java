package esame.modelli;

public class metadata {

		public String nome;
		public String tipo;
		
		public metadata(String nome, String tipo) {
			this.nome = nome;
			this.tipo = tipo;
		}

		/**
		 * @return the nome
		 */
		public String getNome() {
			return nome;
		}

		/**
		 * @param nome the nome to set
		 */
		public void setNome(String nome) {
			this.nome = nome;
		}

		/**
		 * @return the tipo
		 */
		public String getTipo() {
			return tipo;
		}

		/**
		 * @param tipo the tipo to set
		 */
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		

	}

