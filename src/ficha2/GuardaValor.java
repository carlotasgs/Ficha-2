package ficha2;

import java.util.Objects;

public class GuardaValor
{
	private int $segundos;
	private int $minutos;
	private int $horas;
	private int $dias;
	private int $meses;

	/**
	 * @return the $segundos
	 */
	public int get$segundos()
	{
		return $segundos;
	}

	/**
	 * @param $segundos the $segundos to set
	 */
	public void set$segundos(int $segundos)
	{
		this.$segundos = $segundos;
	}

	/**
	 * @return the $minutos
	 */
	public int get$minutos()
	{
		return $minutos;
	}

	/**
	 * @param $minutos the $minutos to set
	 */
	public void set$minutos(int $minutos)
	{
		this.$minutos = $minutos;
	}

	/**
	 * @return the $horas
	 */
	public int get$horas()
	{
		return $horas;
	}

	/**
	 * @param $horas the $horas to set
	 */
	public void set$horas(int $horas)
	{
		this.$horas = $horas;
	}

	/**
	 * @return the $dias
	 */
	public int get$dias()
	{
		return $dias;
	}

	/**
	 * @param $dias the $dias to set
	 */
	public void set$dias(int $dias)
	{
		this.$dias = $dias;
	}

	/**
	 * @return the $meses
	 */
	public int get$meses()
	{
		return $meses;
	}

	/**
	 * @param $meses the $meses to set
	 */
	public void set$meses(int $meses)
	{
		this.$meses = $meses;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash($dias, $horas, $meses, $minutos, $segundos);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuardaValor other = (GuardaValor) obj;
		return $dias == other.$dias && $horas == other.$horas && $meses == other.$meses && $minutos == other.$minutos
				&& $segundos == other.$segundos;
	}

	@Override
	public String toString()
	{
		return "segundos=" + $segundos + ", minutos=" + $minutos + ", horas=" + $horas + ", dias=" + $dias + ", meses="
				+ $meses + " ";
	}

}
