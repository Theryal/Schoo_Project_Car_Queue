public class Pojazd implements Comparable<Pojazd> {
    private String _marka;
    private String _rocznik;
    private String _kolor;

    public Pojazd(String marka, String rocznik, String kolor) {
        _marka = marka;
        _rocznik = rocznik;
        _kolor = kolor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(_marka);
        sb.append(" ");
        sb.append(_rocznik);
        sb.append(": ");
        sb.append(_kolor);

        return sb.toString();
    }

    @Override
    public int compareTo(Pojazd o) {
        int order = _rocznik.compareTo(o._rocznik);
        if (order != 0) return order;
        return _kolor.compareTo(o._kolor);
    }
}
