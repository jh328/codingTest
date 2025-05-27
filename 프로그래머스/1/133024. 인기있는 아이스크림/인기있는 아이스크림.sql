# 총 주문량 기준으로 내림찬수 / 같으면 번호 기준으로 오름차순
SELECT fh.FLAVOR
FROM FIRST_HALF as fh
order by fh.total_order desc, fh.shipment_id asc