package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		// Pegando a data de hoje: Criando uma Data
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		// Quanto tempo falta para: aqui crio ate e passo nos paramentors ano, mes e dia
		// que qeuroa calcular.
		LocalDate copaMundo = LocalDate.of(2022, Month.NOVEMBER, 10);

		// Aqui calcular periodo que falta de hoje ate a data anterior q passei. Ou seja
		// a diferença entre datas.
		Period periodo = Period.between(hoje, copaMundo);
		System.out
				.println("Dia: " + periodo.getDays() + " Mês: " + periodo.getMonths() + " Ano: " + periodo.getYears());

		LocalDate proximaCopa = copaMundo.plusYears(4);
		System.out.println("Próxima Copa será na data: " + proximaCopa);

		// Criando um formatador de datas:
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Próxima Copa será na data: " + proximaCopa.format(formatador));

		// Criando o formater de Dia/mes/ano hora:minuto:segundo
		DateTimeFormatter dataHoraFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		// Pegadno data e hora de hoje:
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(dataHoraFormatada));

		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);

		// Crie um LocalDate para representar o dia 25 de Janeiro de 2099.
		LocalDate data = LocalDate.of(2099, 1, 25);
		System.out.println(data);

		// ou
		LocalDate data1 = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(data1.format(formatador));

		// Como criar um período entre hoje e a data que você criou no exercício
		// anterior?
		LocalDate agoraNow = LocalDate.now();
		LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

		Period periodo1 = Period.between(agoraNow, dataFutura);
		System.out.println(
				"Dia: " + periodo1.getDays() + " Mês: " + periodo1.getMonths() + " Ano: " + periodo1.getYears());

		char chars[] = { 'c', 'o', 'd', 'e' };
		String s = new String(chars);
		System.out.println(s);
	}

}
